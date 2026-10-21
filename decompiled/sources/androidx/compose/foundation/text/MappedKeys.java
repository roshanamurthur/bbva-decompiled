package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key_androidKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bM\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bM\u0010NR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R \u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "Landroidx/compose/ui/input/key/Key;", "a", "J", "getA-EK5gGoQ", "()J", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "b", "getC-EK5gGoQ", "C", "c", "getH-EK5gGoQ", "H", "d", "getV-EK5gGoQ", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "e", "getY-EK5gGoQ", "Y", "f", "getX-EK5gGoQ", "X", "g", "getZ-EK5gGoQ", "Z", "h", "getBackslash-EK5gGoQ", "Backslash", "i", "getDirectionLeft-EK5gGoQ", "DirectionLeft", "j", "getDirectionRight-EK5gGoQ", "DirectionRight", "k", "getDirectionUp-EK5gGoQ", "DirectionUp", "l", "getDirectionDown-EK5gGoQ", "DirectionDown", "m", "getPageUp-EK5gGoQ", "PageUp", "n", "getPageDown-EK5gGoQ", "PageDown", "o", "getMoveHome-EK5gGoQ", "MoveHome", "p", "getMoveEnd-EK5gGoQ", "MoveEnd", "q", "getInsert-EK5gGoQ", "Insert", "r", "getEnter-EK5gGoQ", "Enter", "s", "getBackspace-EK5gGoQ", "Backspace", "t", "getDelete-EK5gGoQ", "Delete", "u", "getPaste-EK5gGoQ", "Paste", SharedPrefsStorage.VERSION_KEY, "getCut-EK5gGoQ", "Cut", "w", "getCopy-EK5gGoQ", "Copy", "x", "getTab-EK5gGoQ", "Tab", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MappedKeys {

    @NotNull
    public static final MappedKeys INSTANCE = new MappedKeys();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final long A = Key_androidKt.Key(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final long C = Key_androidKt.Key(31);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long H = Key_androidKt.Key(36);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final long V = Key_androidKt.Key(50);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final long Y = Key_androidKt.Key(53);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final long X = Key_androidKt.Key(52);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final long Z = Key_androidKt.Key(54);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final long Backslash = Key_androidKt.Key(73);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final long DirectionLeft = Key_androidKt.Key(21);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final long DirectionRight = Key_androidKt.Key(22);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final long DirectionUp = Key_androidKt.Key(19);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final long DirectionDown = Key_androidKt.Key(20);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final long PageUp = Key_androidKt.Key(92);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final long PageDown = Key_androidKt.Key(93);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final long MoveHome = Key_androidKt.Key(122);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final long MoveEnd = Key_androidKt.Key(123);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final long Insert = Key_androidKt.Key(124);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final long Enter = Key_androidKt.Key(66);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final long Backspace = Key_androidKt.Key(67);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final long Delete = Key_androidKt.Key(112);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final long Paste = Key_androidKt.Key(279);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final long Cut = Key_androidKt.Key(277);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final long Copy = Key_androidKt.Key(278);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final long Tab = Key_androidKt.Key(61);

    /* JADX INFO: renamed from: getA-EK5gGoQ, reason: not valid java name */
    public final long m509getAEK5gGoQ() {
        return A;
    }

    /* JADX INFO: renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
    public final long m510getBackslashEK5gGoQ() {
        return Backslash;
    }

    /* JADX INFO: renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
    public final long m511getBackspaceEK5gGoQ() {
        return Backspace;
    }

    /* JADX INFO: renamed from: getC-EK5gGoQ, reason: not valid java name */
    public final long m512getCEK5gGoQ() {
        return C;
    }

    /* JADX INFO: renamed from: getCopy-EK5gGoQ, reason: not valid java name */
    public final long m513getCopyEK5gGoQ() {
        return Copy;
    }

    /* JADX INFO: renamed from: getCut-EK5gGoQ, reason: not valid java name */
    public final long m514getCutEK5gGoQ() {
        return Cut;
    }

    /* JADX INFO: renamed from: getDelete-EK5gGoQ, reason: not valid java name */
    public final long m515getDeleteEK5gGoQ() {
        return Delete;
    }

    /* JADX INFO: renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
    public final long m516getDirectionDownEK5gGoQ() {
        return DirectionDown;
    }

    /* JADX INFO: renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
    public final long m517getDirectionLeftEK5gGoQ() {
        return DirectionLeft;
    }

    /* JADX INFO: renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
    public final long m518getDirectionRightEK5gGoQ() {
        return DirectionRight;
    }

    /* JADX INFO: renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
    public final long m519getDirectionUpEK5gGoQ() {
        return DirectionUp;
    }

    /* JADX INFO: renamed from: getEnter-EK5gGoQ, reason: not valid java name */
    public final long m520getEnterEK5gGoQ() {
        return Enter;
    }

    /* JADX INFO: renamed from: getH-EK5gGoQ, reason: not valid java name */
    public final long m521getHEK5gGoQ() {
        return H;
    }

    /* JADX INFO: renamed from: getInsert-EK5gGoQ, reason: not valid java name */
    public final long m522getInsertEK5gGoQ() {
        return Insert;
    }

    /* JADX INFO: renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
    public final long m523getMoveEndEK5gGoQ() {
        return MoveEnd;
    }

    /* JADX INFO: renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
    public final long m524getMoveHomeEK5gGoQ() {
        return MoveHome;
    }

    /* JADX INFO: renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
    public final long m525getPageDownEK5gGoQ() {
        return PageDown;
    }

    /* JADX INFO: renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
    public final long m526getPageUpEK5gGoQ() {
        return PageUp;
    }

    /* JADX INFO: renamed from: getPaste-EK5gGoQ, reason: not valid java name */
    public final long m527getPasteEK5gGoQ() {
        return Paste;
    }

    /* JADX INFO: renamed from: getTab-EK5gGoQ, reason: not valid java name */
    public final long m528getTabEK5gGoQ() {
        return Tab;
    }

    /* JADX INFO: renamed from: getV-EK5gGoQ, reason: not valid java name */
    public final long m529getVEK5gGoQ() {
        return V;
    }

    /* JADX INFO: renamed from: getX-EK5gGoQ, reason: not valid java name */
    public final long m530getXEK5gGoQ() {
        return X;
    }

    /* JADX INFO: renamed from: getY-EK5gGoQ, reason: not valid java name */
    public final long m531getYEK5gGoQ() {
        return Y;
    }

    /* JADX INFO: renamed from: getZ-EK5gGoQ, reason: not valid java name */
    public final long m532getZEK5gGoQ() {
        return Z;
    }
}
