package androidx.compose.ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextAndroidCanvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J$\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J:\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J2\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u000fH\u0016J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0017J0\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u00100\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0012\u00104\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u000201H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0017J\u0018\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0017J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J(\u0010:\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0010\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0005H\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J(\u0010;\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0017J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u000208H\u0017J\u0010\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J\n\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010C\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0018H\u0017J\u0018\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0017J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<H\u0017J0\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020DH\u0017J(\u0010F\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0017J\u0010\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0005H\u0016J0\u0010O\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JH\u0010O\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010T\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J*\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J,\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010\u00052\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017JR\u0010U\u001a\u00020\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010U\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u00102\u001a\u0002012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016JL\u0010f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010a\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J(\u0010j\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u001d2\u0006\u0010h\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000fH\u0016J\u0010\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020mH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020nH\u0016J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020pH\u0017J\u0018\u0010l\u001a\u00020\u00032\u0006\u0010k\u001a\u00020m2\u0006\u0010o\u001a\u00020pH\u0017J0\u0010u\u001a\u00020\u00032\u0006\u0010q\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001d2\u0006\u0010t\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J(\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010x\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010y\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010y\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010z\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010}\u001a\u00020\u00032\u0006\u0010|\u001a\u00020{2\u0006\u0010J\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010~\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u007f\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u0080\u0001\u001a\u00020\u00032\b\u0010v\u001a\u0004\u0018\u00010b2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010v\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010\u0085\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J$\u0010\u0085\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0084\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0019\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J1\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J!\u0010\u0088\u0001\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000fH\u0016J+\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00182\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JC\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0007\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JG\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u001d2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0090\u0001\u001a\u00020\u001d2\u0007\u0010\u0091\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J5\u0010\u0092\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020\u00182\u0007\u0010\u0093\u0001\u001a\u00020b2\u0007\u0010\u008f\u0001\u001a\u00020\u00182\u0007\u0010\u0094\u0001\u001a\u00020b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JH\u0010\u009c\u0001\u001a\u00020\u00032\u0007\u0010\u0095\u0001\u001a\u00020W2\u0007\u0010\u0096\u0001\u001a\u00020\u000f2\u0007\u0010\u0097\u0001\u001a\u00020b2\u0007\u0010\u0098\u0001\u001a\u00020\u000f2\u0007\u0010\u0099\u0001\u001a\u00020\u000f2\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J<\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J+\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JF\u0010£\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J5\u0010£\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010¢\u0001\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016JW\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010w\u001a\u00020\u000f2\u0007\u0010¤\u0001\u001a\u00020\u000f2\u0007\u0010¥\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030 \u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017JX\u0010§\u0001\u001a\u00020\u00032\b\u0010\u0082\u0001\u001a\u00030ª\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001d2\u0006\u0010\\\u001a\u00020\u001d2\u0007\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0017Jw\u0010³\u0001\u001a\u00020\u00032\u0007\u0010o\u001a\u00030«\u00012\u0007\u0010¬\u0001\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u000f2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010b2\u0007\u0010®\u0001\u001a\u00020\u000f2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010e\u001a\u00020\u000f2\n\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\u0007\u0010±\u0001\u001a\u00020\u000f2\u0007\u0010²\u0001\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010¶\u0001\u001a\u00020\u00032\b\u0010µ\u0001\u001a\u00030´\u0001H\u0017¨\u0006¹\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "canvas", "", "setCanvas", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "enableZ", "disableZ", "isOpaque", "", "getWidth", "getHeight", "getDensity", "density", "setDensity", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "alpha", "saveLayerAlpha", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "sx", "sy", ImageScaleTypeHandler.ID, "degrees", "rotate", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "filter", "setDrawFilter", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "Landroid/graphics/Picture;", "picture", "drawPicture", k.a.f65039f, "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "a", "r", "g", "b", "drawARGB", "drawBitmap", "src", "", "colors", TypedValues.CycleType.S_WAVE_OFFSET, "stride", "x", "y", "width", "height", "hasAlpha", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "cx", "cy", "radius", "drawCircle", "color", "drawColor", "", "Landroid/graphics/PorterDuff$Mode;", "mode", "Landroid/graphics/BlendMode;", "startX", "startY", "stopX", "stopY", "drawLine", "pts", "count", "drawLines", "drawOval", "drawPaint", "Landroid/graphics/NinePatch;", PatchCommand.ID, "drawPatch", "drawPath", "drawPoint", "drawPoints", "", "text", FirebaseAnalytics.Param.INDEX, "pos", "drawPosText", "", "drawRect", "drawRGB", "rx", "ry", "drawRoundRect", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "outerRadii", "innerRadii", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "drawText", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "hOffset", "vOffset", "drawTextOnPath", "contextIndex", "contextCount", "isRtl", "drawTextRun", "contextStart", "contextEnd", "Landroid/graphics/text/MeasuredText;", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ClassVerificationFailure"})
public final class TextAndroidCanvas extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f17803a;

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(@NotNull RectF rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(@Nullable Matrix matrix) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a10, int r3, int g6, int b10) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(a10, r3, g6, b10);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@NotNull RectF oval, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(oval, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, float left, float top, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, left, top, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@NotNull Bitmap bitmap, int meshWidth, int meshHeight, @NotNull float[] verts, int vertOffset, @Nullable int[] colors, int colorOffset, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, meshWidth, meshHeight, verts, vertOffset, colors, colorOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(cx, cy, radius, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@NotNull RectF outer, float outerRx, float outerRy, @NotNull RectF inner, float innerRx, float innerRy, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(@NotNull int[] glyphIds, int glyphIdOffset, @NotNull float[] positions, int positionOffset, int glyphCount, @NotNull Font font, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, int offset, int count, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@NotNull RectF oval, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(oval, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@NotNull NinePatch patch, @NotNull Rect dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x4, float y7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(x4, y7, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@Nullable float[] pts, int offset, int count, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(@NotNull char[] text, int index, int count, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(text, index, count, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r3, int g6, int b10) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(r3, g6, b10);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull RectF rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@NotNull RectF rect, float rx, float ry, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rect, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull char[] text, int index, int count, float x4, float y7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, index, count, x4, y7, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull char[] text, int index, int count, @NotNull Path path, float hOffset, float vOffset, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(text, index, count, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@NotNull char[] text, int index, int count, int contextIndex, int contextCount, float x4, float y7, boolean isRtl, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, index, count, contextIndex, contextCount, x4, y7, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@NotNull Canvas.VertexMode mode, int vertexCount, @NotNull float[] verts, int vertOffset, @Nullable float[] texs, int texOffset, @Nullable int[] colors, int colorOffset, @Nullable short[] indices, int indexOffset, int indexCount, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(mode, vertexCount, verts, vertOffset, texs, texOffset, colors, colorOffset, indices, indexOffset, indexCount, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @Nullable
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void getMatrix(@NotNull Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(@NotNull RectF rect, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(@Nullable RectF bounds, @Nullable Paint paint, int saveFlags) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(bounds, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(@Nullable RectF bounds, int alpha, int saveFlags) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@Nullable Bitmap bitmap) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f17803a = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@Nullable DrawFilter filter) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@Nullable Matrix matrix) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.translate(dx, dy);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect src, @NotNull RectF dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long color) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(pts, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@NotNull NinePatch patch, @NotNull RectF dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(pts, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawPosText(@NotNull String text, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(text, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@NotNull Rect r3, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(r3, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(r3, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(left, top, right, bottom, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, float x4, float y7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, x4, y7, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@NotNull String text, @NotNull Path path, float hOffset, float vOffset, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(text, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@NotNull CharSequence text, int start, int end, int contextStart, int contextEnd, float x4, float y7, boolean isRtl, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x4, y7, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rect);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@Nullable RectF bounds, @Nullable Paint paint) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(bounds, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@Nullable RectF bounds, int alpha) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect src, @NotNull Rect dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@NotNull Picture picture, @NotNull Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull String text, int start, int end, float x4, float y7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, start, end, x4, y7, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(@NotNull MeasuredText text, int start, int end, int contextStart, int contextEnd, float x4, float y7, boolean isRtl, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x4, y7, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayer(float left, float top, float right, float bottom, @Nullable Paint paint, int saveFlags) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(left, top, right, bottom, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] colors, int offset, int stride, float x4, float y7, int width, int height, boolean hasAlpha, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(colors, offset, stride, x4, y7, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int color, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(@NotNull CharSequence text, int start, int end, float x4, float y7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(text, start, end, x4, y7, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, @Nullable Paint paint) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean clipRect(float left, float top, float right, float bottom, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public void drawBitmap(@NotNull int[] colors, int offset, int stride, int x4, int y7, int width, int height, boolean hasAlpha, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(colors, offset, stride, x4, y7, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long color, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public boolean quickReject(float left, float top, float right, float bottom, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float left, float top, float right, float bottom) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        Canvas canvas = this.f17803a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(left, top, right, bottom);
    }
}
