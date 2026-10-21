package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import w2.d;

/* JADX INFO: loaded from: classes2.dex */
public final class EmojiTextViewHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21404a;

    @RequiresApi(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f21405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w2.b f21406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21407c = true;

        public a(TextView textView) {
            this.f21405a = textView;
            this.f21406b = new w2.b(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        @NonNull
        public final InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            if (!this.f21407c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof w2.b) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                w2.b bVar = this.f21406b;
                if (i13 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = bVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i13] == bVar) {
                    return inputFilterArr;
                }
                i13++;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final boolean b() {
            return this.f21407c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final void d(boolean z10) {
            this.f21407c = z10;
            e();
            TextView textView = this.f21405a;
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final void e() {
            TextView textView = this.f21405a;
            textView.setTransformationMethod(f(textView.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        @Nullable
        public final TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            if (this.f21407c) {
                return ((transformationMethod instanceof d) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new d(transformationMethod);
            }
            return transformationMethod instanceof d ? ((d) transformationMethod).f94131a : transformationMethod;
        }
    }

    public static class b {
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public void e() {
            throw null;
        }

        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            throw null;
        }
    }

    @RequiresApi(19)
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f21408a;

        public c(TextView textView) {
            this.f21408a = new a(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        @NonNull
        public final InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return EmojiCompat.isConfigured() ^ true ? inputFilterArr : this.f21408a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final boolean b() {
            return this.f21408a.f21407c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final void c(boolean z10) {
            if (!EmojiCompat.isConfigured()) {
                return;
            }
            this.f21408a.c(z10);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final void d(boolean z10) {
            boolean z11 = !EmojiCompat.isConfigured();
            a aVar = this.f21408a;
            if (z11) {
                aVar.f21407c = z10;
            } else {
                aVar.d(z10);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        public final void e() {
            if (!EmojiCompat.isConfigured()) {
                return;
            }
            this.f21408a.e();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.b
        @Nullable
        public final TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return EmojiCompat.isConfigured() ^ true ? transformationMethod : this.f21408a.f(transformationMethod);
        }
    }

    public EmojiTextViewHelper(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.f21404a.a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.f21404a.b();
    }

    public void setAllCaps(boolean z10) {
        this.f21404a.c(z10);
    }

    public void setEnabled(boolean z10) {
        this.f21404a.d(z10);
    }

    public void updateTransformationMethod() {
        this.f21404a.e();
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.f21404a.f(transformationMethod);
    }

    public EmojiTextViewHelper(@NonNull TextView textView, boolean z10) {
        Preconditions.checkNotNull(textView, "textView cannot be null");
        if (z10) {
            this.f21404a = new a(textView);
        } else {
            this.f21404a = new c(textView);
        }
    }
}
