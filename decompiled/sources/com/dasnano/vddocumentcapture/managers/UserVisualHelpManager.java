package com.dasnano.vddocumentcapture.managers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.n1;
import androidx.camera.core.z;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.activities.DocumentClassificationInterface;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.document.DocumentFace;
import com.dasnano.vddocumentcapture.other.Arrow;
import com.dasnano.vddocumentcapture.other.DocumentRectangleOrFace;
import com.dasnano.vddocumentcapture.other.LightSpotsView;
import com.dasnano.vddocumentcapture.other.Rectangle;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.bidicode.entities.BidiCodeRegion;
import com.veridas.config.Configuration;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.dialog.DialogRegistry;
import com.veridas.lib.entities.resources.Document;
import com.veridas.log.Log;
import com.veridas.resource.AndroidResourcesUtil;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.Thread;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class UserVisualHelpManager {
    public static final int COUNTDOWN_ANIMATION_DURATION = 400;
    public int A;
    public Spanned C;
    public Spanned D;
    public Spanned E;
    public Spanned F;
    public Spanned G;
    public CharSequence H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f39410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f39411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile CharSequence f39412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f39413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DocumentRectangleOrFace f39414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HelpManagerInterface f39415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Arrow f39416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Arrow f39417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Arrow f39418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Arrow f39419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rectangle f39420k;
    public LightSpotsView m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f39427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39428t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f39429u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f39430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f39431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f39432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f39433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f39434z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f39421l = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile AtomicInteger f39422n = new AtomicInteger(-1);
    public int[] B = new int[0];
    public volatile d I = d.LEVEL_ONE;

    public interface HelpManagerInterface {
        GenericDocumentState getGenericDocumentState();

        DocumentClassificationInterface getIVDDocumentDelegate();

        List<String> getPossibleDocs();
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f39435p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f39436q0;

        public a(String str, boolean z10) {
            this.f39435p0 = str;
            this.f39436q0 = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Spanned spanned;
            boolean zIsPassport = Document.isPassport(this.f39435p0);
            UserVisualHelpManager userVisualHelpManager = UserVisualHelpManager.this;
            if (zIsPassport) {
                spanned = userVisualHelpManager.E;
            } else {
                spanned = this.f39436q0 ? userVisualHelpManager.F : userVisualHelpManager.G;
            }
            userVisualHelpManager.f39410a.setBackgroundColor(userVisualHelpManager.f39433y);
            userVisualHelpManager.f39410a.setText(HtmlCompat.fromHtml(spanned.toString(), 0));
            userVisualHelpManager.f39410a.setTextColor(userVisualHelpManager.f39431w);
            userVisualHelpManager.f39410a.setVisibility(4);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Activity f39438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Configuration f39439q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BackgroundThreadsManager f39440r0;

        public b(Activity activity, Configuration configuration, BackgroundThreadsManager backgroundThreadsManager) {
            this.f39438p0 = activity;
            this.f39439q0 = configuration;
            this.f39440r0 = backgroundThreadsManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            UserVisualHelpManager userVisualHelpManager = UserVisualHelpManager.this;
            VDEnums.VDCaptureType vDCaptureType = userVisualHelpManager.f39415f.getGenericDocumentState().isReverseFace ? VDEnums.VDCaptureType.VD_REVERSE_WITHOUT_FLASH : VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH;
            userVisualHelpManager.getClass();
            Thread.runOnUiThread(new j(userVisualHelpManager, vDCaptureType));
            boolean z10 = userVisualHelpManager.f39427s;
            Activity activity = this.f39438p0;
            if (!z10) {
                userVisualHelpManager.a(activity, this.f39439q0, this.f39440r0);
            } else {
                activity.getResources().getColor(R.color.vd_document_dialog_button);
                userVisualHelpManager.getClass();
                throw null;
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Activity f39442p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Rect f39443q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Point f39444r0;

        public c(Activity activity, Rect rect, Point point) {
            this.f39442p0 = activity;
            this.f39443q0 = rect;
            this.f39444r0 = point;
        }

        @Override // java.lang.Runnable
        public final void run() {
            UserVisualHelpManager userVisualHelpManager = UserVisualHelpManager.this;
            userVisualHelpManager.disableTextViewHelp();
            userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(this.f39442p0, this.f39443q0, this.f39444r0);
        }
    }

    public enum d {
        LEVEL_ONE(0),
        LEVEL_TWO(25),
        LEVEL_THREE(62),
        LEVEL_FOUR(100);

        public final int start;

        d(int i10) {
            this.start = i10;
        }
    }

    public UserVisualHelpManager(HelpManagerInterface helpManagerInterface, DialogRegistry dialogRegistry) {
        this.f39415f = helpManagerInterface;
    }

    public static Rect getBiggestRect(List<Rect> list) {
        Rect rect = list.get(0);
        for (Rect rect2 : list) {
            if (rect2.height() * rect2.width() > rect.height() * rect.width()) {
                rect = rect2;
            }
        }
        return rect;
    }

    public final void a(Activity activity, Configuration configuration, BackgroundThreadsManager backgroundThreadsManager) {
        Handler helpBackgroundHandler;
        if (backgroundThreadsManager == null || (helpBackgroundHandler = backgroundThreadsManager.getHelpBackgroundHandler()) == null) {
            return;
        }
        helpBackgroundHandler.postDelayed(new b(activity, configuration, backgroundThreadsManager), this.f39432x * 1000);
    }

    public void applyConfiguration(Activity activity, Configuration configuration) throws IllegalColorValueException, PropertyNameNotFoundException {
        configuration.getString("alertstyle");
        this.f39428t = configuration.getColor(VDDocumentConfiguration.DOCUMENT_DETECTED_OK_LEVEL1_COLOR);
        this.f39429u = configuration.getColor(VDDocumentConfiguration.DOCUMENT_DETECTED_OK_LEVEL2_COLOR);
        this.f39430v = configuration.getColor(VDDocumentConfiguration.DOCUMENT_DETECTED_OK_LEVEL3_COLOR);
        this.C = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.DOCUMENT_VERY_FAR), 0);
        this.D = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.DOCUMENT_VERY_CLOSE), 0);
        this.f39431w = configuration.getColor("informativetextcolor");
        this.f39423o = configuration.getBoolean("fixedrectangle");
        this.f39424p = configuration.getBoolean(VDDocumentConfiguration.FIXED_TEMPLATE);
        this.f39425q = configuration.getString("facing").equalsIgnoreCase("front");
        this.F = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.OBVERSE_NOT_FOUND_TEXT), 0);
        this.E = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.PASSPORT_NOT_FOUND_TEXT), 0);
        this.G = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.REVERSE_NOT_FOUND_TEXT), 0);
        this.f39432x = configuration.getInteger(VDDocumentConfiguration.SECONDS_WITHOUT_PICTURE);
        this.f39426r = configuration.getBoolean(VDDocumentConfiguration.ARROWS);
        this.f39427s = configuration.getBoolean(VDDocumentConfiguration.SHOW_USER_HELP);
        this.f39433y = configuration.getColor("textbackgroundcolor");
        this.f39434z = configuration.getColor("tickcolor");
        this.A = configuration.getColor("tickcirclecolor");
        configuration.getString(VDDocumentConfiguration.USER_HELP_DIALOG_MESSAGE);
        configuration.getString(VDDocumentConfiguration.USER_HELP_DIALOG_NEGATIVE_BUTTON);
        configuration.getString(VDDocumentConfiguration.USER_HELP_DIALOG_POSITIVE_BUTTON);
        configuration.getString(VDDocumentConfiguration.USER_HELP_DIALOG_TITLE);
        int[] iArr = {configuration.getColor(VDDocumentConfiguration.ARROW_COLOR_1), configuration.getColor(VDDocumentConfiguration.ARROW_COLOR_2), configuration.getColor(VDDocumentConfiguration.ARROW_COLOR_3), configuration.getColor(VDDocumentConfiguration.ARROW_COLOR_4), configuration.getColor(VDDocumentConfiguration.ARROW_COLOR_5)};
        this.B = iArr;
        this.f39416g.setPaths(iArr);
        this.f39417h.setPaths(this.B);
        this.f39418i.setPaths(this.B);
        this.f39419j.setPaths(this.B);
        Drawable[] drawableArr = {ContextCompat.getDrawable(activity, R.mipmap.vd_document_circle), ContextCompat.getDrawable(activity, R.mipmap.vd_document_tick)};
        try {
            Drawable drawable = drawableArr[0];
            int i10 = this.A;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i10, mode);
            drawableArr[1].setColorFilter(this.f39434z, mode);
        } catch (Exception e5) {
            Log.e("UserVisualHelpManager", "Exception changing vd_document_tick colors: " + e5);
        }
        this.f39413d.setImageDrawable(new LayerDrawable(drawableArr));
    }

    public void changeRectangleColor(Activity activity, int i10, Rect rect, Point point) {
        d dVar;
        d dVar2;
        d dVar3 = d.LEVEL_TWO;
        if (i10 < dVar3.start) {
            dVar = d.LEVEL_ONE;
        } else {
            d dVar4 = d.LEVEL_THREE;
            if (i10 < dVar4.start) {
                dVar = dVar3;
            } else {
                d dVar5 = d.LEVEL_FOUR;
                dVar = i10 < dVar5.start ? dVar4 : dVar5;
            }
        }
        d dVar6 = this.I;
        int iOrdinal = dVar.ordinal() - dVar6.ordinal();
        int i11 = 0;
        if (Math.abs(iOrdinal) > 1) {
            d[] dVarArrValues = d.values();
            int iSignum = Integer.signum(iOrdinal) + dVar6.ordinal();
            if (iSignum < 0) {
                dVar2 = dVarArrValues[0];
            } else {
                dVar2 = iSignum >= dVarArrValues.length ? dVarArrValues[dVarArrValues.length - 1] : dVarArrValues[iSignum];
            }
        } else {
            dVar2 = dVar;
        }
        if (dVar == dVar2 && dVar.start != this.I.start) {
            this.I = dVar;
        }
        if (dVar2 != d.LEVEL_ONE) {
            if (dVar2 == dVar3) {
                i11 = this.f39430v;
            } else if (dVar2 == d.LEVEL_THREE) {
                i11 = this.f39429u;
            } else if (dVar2 == d.LEVEL_FOUR) {
                i11 = this.f39428t;
            }
            setReferenceRectColor(i11);
            Thread.runOnUiThread(new c(activity, rect, point));
        }
    }

    public void disableTextViewHelp() {
        Thread.runOnUiThread(new n1(this, 5));
    }

    public void drawBidiCodesFound(Rect rect) {
        Thread.runOnUiThread(new e(this, rect, 0));
    }

    public void drawDocumentHelpTemplate(String str, DocumentFace documentFace, Rect rect, IBlockingResourcesDatabase iBlockingResourcesDatabase) {
        byte[] reverseStencilBytes;
        if (str == null || str.equalsIgnoreCase("")) {
            Thread.runOnUiThread(new i(this, null, null));
            return;
        }
        Document documentById = iBlockingResourcesDatabase.getDocumentById(str);
        if (documentById == null || documentFace != DocumentFace.OBVERSE) {
            reverseStencilBytes = (documentById == null || documentFace != DocumentFace.REVERSE) ? null : iBlockingResourcesDatabase.getReverseStencilBytes(str);
        } else {
            reverseStencilBytes = iBlockingResourcesDatabase.getObverseStencilBytes(str);
        }
        Bitmap bitmapBytesToBitmap = reverseStencilBytes != null ? AndroidResourcesUtil.bytesToBitmap(reverseStencilBytes) : null;
        if (bitmapBytesToBitmap == null) {
            Thread.runOnUiThread(new i(this, null, null));
            return;
        }
        int width = bitmapBytesToBitmap.getWidth();
        int height = bitmapBytesToBitmap.getHeight();
        float fWidth = rect.width() / width;
        float fHeight = rect.height() / height;
        Matrix matrix = new Matrix();
        matrix.postScale(fWidth, fHeight);
        if (this.f39425q) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Thread.runOnUiThread(new i(this, Bitmap.createBitmap(bitmapBytesToBitmap, 0, 0, width, height, matrix, true), rect));
    }

    public void drawDocumentReference(Activity activity, Rect rect, Point point) {
        if (this.f39423o) {
            setDocumentReferenceDocumentOrFaceRectangle(activity, rect, point);
        } else {
            this.f39414e.setAlpha(0.0f);
        }
    }

    public void drawLightSpots(List<Rect> list) {
        this.m.setRects(selectBiggestRectAndResize(list));
    }

    public void drawRect(Rect rect) {
        Thread.runOnUiThread(new androidx.room.i(this, rect, 2));
    }

    public void drawTextViewHelp(String str, boolean z10) {
        Thread.runOnUiThread(new a(str, z10));
    }

    public void enableTextViewHelp() {
        Thread.runOnUiThread(new z(this, 4));
    }

    public void flipDocument() {
        Thread.runOnUiThread(new f(this));
    }

    public synchronized int getReferenceRectColor() {
        return this.f39422n.get();
    }

    public CharSequence getTextToShow() {
        CharSequence charSequence;
        synchronized (this) {
            charSequence = this.f39412c;
        }
        return charSequence;
    }

    public TextView getTextViewHelp() {
        return this.f39410a;
    }

    public void hideTickImageView() {
        this.f39413d.setVisibility(4);
    }

    public void initialize(Activity activity, View view) {
        this.H = activity.getResources().getText(R.string.vd_document_document_empty);
        this.f39418i = (Arrow) view.findViewById(R.id.vd_document_arrow_bottom_left);
        this.f39419j = (Arrow) view.findViewById(R.id.vd_document_arrow_bottom_right);
        this.f39416g = (Arrow) view.findViewById(R.id.vd_document_arrow_top_left);
        this.f39417h = (Arrow) view.findViewById(R.id.vd_document_arrow_top_right);
        this.f39414e = (DocumentRectangleOrFace) view.findViewById(R.id.vd_document_document_rectangle_less21);
        this.f39411b = (ImageView) view.findViewById(R.id.vd_document_image_view_help_documents_less21);
        this.m = (LightSpotsView) view.findViewById(R.id.vd_document_light_spots_view);
        this.f39420k = (Rectangle) view.findViewById(R.id.vd_document_rectangle_esp_dni20_fragment_api_less21);
        this.f39410a = (TextView) view.findViewById(R.id.vd_document_help_text_document_less21);
        this.f39413d = (ImageView) view.findViewById(R.id.vd_document_tick_view);
    }

    public void postHelpDelayed(Activity activity, Configuration configuration, BackgroundThreadsManager backgroundThreadsManager) {
        a(activity, configuration, backgroundThreadsManager);
    }

    public void removeCallbacks(BackgroundThreadsManager backgroundThreadsManager) {
        Handler helpBackgroundHandler = backgroundThreadsManager.getHelpBackgroundHandler();
        if (helpBackgroundHandler == null) {
            return;
        }
        helpBackgroundHandler.removeCallbacksAndMessages(null);
    }

    public void removeLightSpotsView() {
        drawLightSpots(new ArrayList());
    }

    public void resetProgressLevel() {
        this.I = d.LEVEL_ONE;
    }

    public List<Rect> selectBiggestRectAndResize(List<Rect> list) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Rect biggestRect = getBiggestRect(list);
        int width = this.f39414e.getWidth();
        int i10 = width / 10;
        if (biggestRect.width() < i10) {
            int i11 = i10 / 2;
            biggestRect = new Rect(Math.max(0, biggestRect.centerX() - i11), Math.max(0, biggestRect.centerY() - i11), Math.min(biggestRect.centerX() + i11, width), Math.min(biggestRect.centerY() + i11, this.f39414e.getHeight()));
        }
        arrayList.add(biggestRect);
        return arrayList;
    }

    public void setArrowAttributes(Rect rect, boolean z10, VDConstantDefinition.TemplateProximity templateProximity, int i10, Rect rect2, Point point) {
        if (this.f39426r) {
            if (!z10 || rect == null || (!(templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_FAR || templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE) || i10 >= 25)) {
                this.f39416g.setAttributes(null, null, 0);
                this.f39417h.setAttributes(null, null, 0);
                this.f39418i.setAttributes(null, null, 0);
                this.f39419j.setAttributes(null, null, 0);
                return;
            }
            int iMin = Math.min(point.x, point.y);
            this.f39416g.setAttributes(new Point(rect.left, rect.top), new Point(rect2.left, rect2.top), iMin);
            this.f39417h.setAttributes(new Point(rect.right, rect.top), new Point(rect2.right, rect2.top), iMin);
            this.f39418i.setAttributes(new Point(rect.left, rect.bottom), new Point(rect2.left, rect2.bottom), iMin);
            this.f39419j.setAttributes(new Point(rect.right, rect.bottom), new Point(rect2.right, rect2.bottom), iMin);
        }
    }

    public void setDocumentReferenceDocumentOrFaceRectangle(Activity activity, Rect rect, Point point) {
        this.f39414e.setDocumentOrFaceRectangle(getReferenceRectColor(), rect, DocumentRectangleOrFace.TypesDrawables.ROUNDED_RECTANGLE, Math.min(point.x, point.y), activity);
    }

    public void setHelpText(CharSequence charSequence) {
        this.f39410a.setVisibility(4);
        if (charSequence == null) {
            this.f39410a.setText("");
        } else {
            this.f39410a.setText(charSequence);
            this.f39410a.setVisibility(0);
        }
    }

    public void setImageViewHelpTemplateDocVisibility() {
        if (this.f39424p) {
            Thread.runOnUiThread(new h(this));
        } else {
            Thread.runOnUiThread(new g(this));
        }
    }

    public void setLightSpotsViewColor(int i10) {
        this.m.setColor(i10);
    }

    public synchronized void setReferenceRectColor(int i10) {
        this.f39422n.set(i10);
    }

    public void setTextToShow(CharSequence charSequence) {
        synchronized (this) {
            this.f39412c = charSequence;
        }
    }

    public void setTextToShowDependingOnDocumentTypeAndState(String str, DocumentFace documentFace) {
        if (Document.isPassport(str)) {
            setTextToShow(this.E);
        } else if (documentFace == DocumentFace.OBVERSE) {
            setTextToShow(this.F);
        } else {
            setTextToShow(this.G);
        }
    }

    public void setTextToShowDependingOnTemplateProximity(GenericDocumentState genericDocumentState, VDConstantDefinition.TemplateProximity templateProximity) {
        if (templateProximity == VDConstantDefinition.TemplateProximity.ERROR) {
            if (genericDocumentState == GenericDocumentState.SEARCHING_REVERSE) {
                setTextToShow(this.G);
                return;
            } else if (genericDocumentState == GenericDocumentState.SEARCHING_PASSPORT) {
                setTextToShow(this.E);
                return;
            } else {
                setTextToShow(this.F);
                return;
            }
        }
        if (templateProximity != VDConstantDefinition.TemplateProximity.NOT_FOUND) {
            if (templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_FAR && genericDocumentState.isSearching) {
                setTextToShow(this.C);
                return;
            } else if (templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE && genericDocumentState.isSearching) {
                setTextToShow(this.D);
                return;
            } else {
                setTextToShow(this.F);
                return;
            }
        }
        if (genericDocumentState == GenericDocumentState.SEARCHING_REVERSE) {
            setTextToShow(this.G);
            return;
        }
        if (genericDocumentState == GenericDocumentState.SEARCHING_OBVERSE) {
            setTextToShow(this.F);
        } else if (genericDocumentState == GenericDocumentState.SEARCHING_PASSPORT) {
            setTextToShow(this.E);
        } else {
            setTextToShow(this.H);
        }
    }

    public void showTickImageView() {
        this.f39413d.setVisibility(0);
    }

    public void addBidiCodeFound(BidiCodeRegion bidiCodeRegion, Context context) {
    }
}
