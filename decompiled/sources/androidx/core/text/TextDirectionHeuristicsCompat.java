package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new e(null, false);
    public static final TextDirectionHeuristicCompat RTL = new e(null, true);

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20139a = new a();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.c
        public final int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (true) {
                char c10 = 2;
                if (i10 >= i12) {
                    return z10 ? 1 : 2;
                }
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.LTR;
                if (directionality == 0) {
                    c10 = 1;
                } else if (directionality == 1 || directionality == 2) {
                    c10 = 0;
                }
                if (c10 == 0) {
                    return 0;
                }
                if (c10 == 1) {
                    z10 = true;
                }
                i10++;
            }
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20140a = new b();

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.c
        public final int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.LTR;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i13 = 1;
                                break;
                            case 16:
                            case 17:
                                i13 = 0;
                                break;
                            default:
                                i13 = 2;
                                break;
                        }
                    } else {
                        i13 = 0;
                    }
                } else {
                    i13 = 1;
                }
                i10++;
            }
            return i13;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements TextDirectionHeuristicCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f20141a;

        public d(c cVar) {
            this.f20141a = cVar;
        }

        public abstract boolean a();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public final boolean isRtl(char[] cArr, int i10, int i11) {
            return isRtl(CharBuffer.wrap(cArr), i10, i11);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public final boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            c cVar = this.f20141a;
            if (cVar == null) {
                return a();
            }
            int iA = cVar.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20142b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f20142b = z10;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.d
        public final boolean a() {
            return this.f20142b;
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f20143b = new f(null);

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.d
        public final boolean a() {
            return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f20140a;
        FIRSTSTRONG_LTR = new e(bVar, false);
        FIRSTSTRONG_RTL = new e(bVar, true);
        ANYRTL_LTR = new e(a.f20139a, false);
        LOCALE = f.f20143b;
    }
}
