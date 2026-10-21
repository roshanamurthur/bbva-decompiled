package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourcesWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class i1 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f1621a;

    public i1(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1621a = resources;
    }

    public final Drawable a(int i10) throws Resources.NotFoundException {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        return this.f1621a.getAnimation(i10);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        return this.f1621a.getBoolean(i10);
    }

    @Override // android.content.res.Resources
    public int getColor(int i10) throws Resources.NotFoundException {
        return this.f1621a.getColor(i10);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        return this.f1621a.getColorStateList(i10);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1621a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        return this.f1621a.getDimension(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return this.f1621a.getDimensionPixelOffset(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return this.f1621a.getDimensionPixelSize(i10);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1621a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        return this.f1621a.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawableForDensity(this.f1621a, i10, i11, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) {
        return this.f1621a.getFraction(i10, i11, i12);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1621a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i10) throws Resources.NotFoundException {
        return this.f1621a.getIntArray(i10);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        return this.f1621a.getInteger(i10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        return this.f1621a.getLayout(i10);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i10) throws Resources.NotFoundException {
        return this.f1621a.getMovie(i10);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11, Object... objArr) throws Resources.NotFoundException {
        return this.f1621a.getQuantityString(i10, i11, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        return this.f1621a.getQuantityText(i10, i11);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return this.f1621a.getResourceEntryName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i10) throws Resources.NotFoundException {
        return this.f1621a.getResourceName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return this.f1621a.getResourcePackageName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return this.f1621a.getResourceTypeName(i10);
    }

    @Override // android.content.res.Resources
    public String getString(int i10) throws Resources.NotFoundException {
        return this.f1621a.getString(i10);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i10) throws Resources.NotFoundException {
        return this.f1621a.getStringArray(i10);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10) throws Resources.NotFoundException {
        return this.f1621a.getText(i10);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        return this.f1621a.getTextArray(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f1621a.getValue(i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f1621a.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        return this.f1621a.getXml(i10);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1621a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        return this.f1621a.obtainTypedArray(i10);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10) throws Resources.NotFoundException {
        return this.f1621a.openRawResource(i10);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return this.f1621a.openRawResourceFd(i10);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1621a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1621a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1621a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawable(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawable(this.f1621a, i10, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi(21)
    public Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return ResourcesCompat.getDrawableForDensity(this.f1621a, i10, i11, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        return this.f1621a.getQuantityString(i10, i11);
    }

    @Override // android.content.res.Resources
    public String getString(int i10, Object... objArr) throws Resources.NotFoundException {
        return this.f1621a.getString(i10, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10, CharSequence charSequence) {
        return this.f1621a.getText(i10, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f1621a.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1621a.openRawResource(i10, typedValue);
    }
}
