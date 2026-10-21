package androidx.compose.ui.graphics.vector.compat;

import android.R;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidVectorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bm\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bs\u0010tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\"\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001a\u0010(\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u001a\u0010+\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010.\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010\fR\u001a\u00101\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u00104\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\fR\u001a\u00107\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001a\u0010:\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\fR\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u001a\u0010@\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010\fR\u001a\u0010C\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001a\u0010F\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bD\u0010\n\u001a\u0004\bE\u0010\fR\u001a\u0010I\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001a\u0010L\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\fR\u001a\u0010O\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001a\u0010R\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bP\u0010\n\u001a\u0004\bQ\u0010\fR\u001a\u0010U\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u001a\u0010X\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010\n\u001a\u0004\bW\u0010\fR\u001a\u0010[\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u001a\u0010^\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\\\u0010\n\u001a\u0004\b]\u0010\fR\u001a\u0010a\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001a\u0010d\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bb\u0010\n\u001a\u0004\bc\u0010\fR\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R\u001a\u0010j\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bh\u0010\n\u001a\u0004\bi\u0010\fR\u001a\u0010k\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u001a\u0010m\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u001a\u0010o\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u001a\u0010q\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\f¨\u0006u"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorResources;", "", "", "a", "[I", "getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY", "()[I", "STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSTYLEABLE_VECTOR_DRAWABLE_ALPHA", "()I", "STYLEABLE_VECTOR_DRAWABLE_ALPHA", "c", "getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED", "STYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED", "d", "getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT", "STYLEABLE_VECTOR_DRAWABLE_HEIGHT", "e", "getSTYLEABLE_VECTOR_DRAWABLE_TINT", "STYLEABLE_VECTOR_DRAWABLE_TINT", "f", "getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE", "STYLEABLE_VECTOR_DRAWABLE_TINT_MODE", "g", "getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT", "STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT", "h", "getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH", "i", "getSTYLEABLE_VECTOR_DRAWABLE_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_WIDTH", "j", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP", "STYLEABLE_VECTOR_DRAWABLE_GROUP", "k", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X", "l", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y", "STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y", "m", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION", "STYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION", "n", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X", "o", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y", "STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y", "p", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X", "q", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y", "STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y", "r", "getSTYLEABLE_VECTOR_DRAWABLE_PATH", "STYLEABLE_VECTOR_DRAWABLE_PATH", "s", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA", "STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA", "t", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR", "STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR", "u", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA", "STYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA", SharedPrefsStorage.VERSION_KEY, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA", "w", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR", "x", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP", "y", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN", "z", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH", "B", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END", "C", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET", "D", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START", ExifInterface.LONGITUDE_EAST, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE", "F", "getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH", "G", "getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA", "STYLEABLE_VECTOR_DRAWABLE_NAME", "getSTYLEABLE_VECTOR_DRAWABLE_NAME", "STYLEABLE_VECTOR_DRAWABLE_GROUP_NAME", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME", "STYLEABLE_VECTOR_DRAWABLE_PATH_NAME", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME", "getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidVectorResources {

    @NotNull
    public static final AndroidVectorResources INSTANCE = new AndroidVectorResources();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final int[] STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_ALPHA = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_HEIGHT = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_TINT = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_TINT_MODE = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_WIDTH = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final int[] STYLEABLE_VECTOR_DRAWABLE_GROUP = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y = 2;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final int[] STYLEABLE_VECTOR_DRAWABLE_PATH = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA = 12;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA = 11;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN = 9;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT = 10;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH = 4;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END = 6;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET = 7;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START = 5;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE = 13;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final int[] STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH = {R.attr.name, R.attr.pathData};

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final int STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA = 1;

    public final int getSTYLEABLE_VECTOR_DRAWABLE_ALPHA() {
        return STYLEABLE_VECTOR_DRAWABLE_ALPHA;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED() {
        return STYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH() {
        return STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME() {
        return 0;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA() {
        return STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_GROUP() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME() {
        return 0;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y() {
        return STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT() {
        return STYLEABLE_VECTOR_DRAWABLE_HEIGHT;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_NAME() {
        return 0;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_PATH() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME() {
        return 0;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START() {
        return STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_TINT() {
        return STYLEABLE_VECTOR_DRAWABLE_TINT;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE() {
        return STYLEABLE_VECTOR_DRAWABLE_TINT_MODE;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY() {
        return STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT() {
        return STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH() {
        return STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_WIDTH() {
        return STYLEABLE_VECTOR_DRAWABLE_WIDTH;
    }
}
