package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.TypedArrayUtils;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class StateListDrawableCompat extends DrawableContainerCompat {
    public a H0;
    public boolean I0;

    public static class a extends DrawableContainerCompat.c {
        public int[][] I;

        public a(a aVar, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(aVar, stateListDrawableCompat, resources);
            if (aVar != null) {
                this.I = aVar.I;
            } else {
                this.I = new int[this.f769g.length][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.c
        public void e() {
            int[][] iArr = this.I;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.I[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.I = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.I;
            int i10 = this.f770h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawableCompat(this, resources);
        }
    }

    public StateListDrawableCompat() {
        this(null, null);
    }

    public static int[] g(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    public void addState(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            a aVar = this.H0;
            aVar.I[aVar.a(drawable)] = iArr;
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void e(@NonNull DrawableContainerCompat.c cVar) {
        super.e(cVar);
        if (cVar instanceof a) {
            this.H0 = (a) cVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(this.H0, this, null);
    }

    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int next;
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.StateListDrawable);
        setVisible(typedArrayObtainAttributes.getBoolean(R.styleable.StateListDrawable_android_visible, true), true);
        a aVar = this.H0;
        aVar.f766d |= Compatibility.Api21Impl.getChangingConfigurations(typedArrayObtainAttributes);
        aVar.f771i = typedArrayObtainAttributes.getBoolean(R.styleable.StateListDrawable_android_variablePadding, aVar.f771i);
        aVar.f774l = typedArrayObtainAttributes.getBoolean(R.styleable.StateListDrawable_android_constantSize, aVar.f774l);
        aVar.f787z = typedArrayObtainAttributes.getInt(R.styleable.StateListDrawable_android_enterFadeDuration, aVar.f787z);
        aVar.A = typedArrayObtainAttributes.getInt(R.styleable.StateListDrawable_android_exitFadeDuration, aVar.A);
        aVar.f785x = typedArrayObtainAttributes.getBoolean(R.styleable.StateListDrawable_android_dither, aVar.f785x);
        DrawableContainerCompat.c cVar = this.f752p0;
        if (resources != null) {
            cVar.f764b = resources;
            int i10 = resources.getDisplayMetrics().densityDpi;
            if (i10 == 0) {
                i10 = 160;
            }
            int i11 = cVar.f765c;
            cVar.f765c = i10;
            if (i11 != i10) {
                cVar.m = false;
                cVar.f772j = false;
            }
        } else {
            cVar.getClass();
        }
        typedArrayObtainAttributes.recycle();
        a aVar2 = this.H0;
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlPullParser.getName().equals(AnalyticsConstants.Key.ITEM)) {
                TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.StateListDrawableItem);
                int resourceId = typedArrayObtainAttributes2.getResourceId(R.styleable.StateListDrawableItem_android_drawable, -1);
                Drawable drawable = resourceId > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId) : null;
                typedArrayObtainAttributes2.recycle();
                int[] iArrG = g(attributeSet);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    drawable = Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                aVar2.I[aVar2.a(drawable)] = iArrG;
            }
        }
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.I0 && super.mutate() == this) {
            this.H0.e();
            this.I0 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iF = this.H0.f(iArr);
        if (iF < 0) {
            iF = this.H0.f(StateSet.WILD_CARD);
        }
        return d(iF) || zOnStateChange;
    }

    public StateListDrawableCompat(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }
}
