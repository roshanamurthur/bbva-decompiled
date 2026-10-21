package com.noknok.android.client.asm.api.uaf.json;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class DisplayPNGCharacteristicsDescriptor {
    public static final short MIN_SIZE_IN_BYTES = 13;
    public static final short RGBPALLETE_ENTRY_SIZE = 6;

    @Expose
    public byte bitDepth;

    @Expose
    public byte colorType;

    @Expose
    public byte compression;

    @Expose
    public byte filter;

    @Expose
    public long height;

    @Expose
    public byte interlace;

    @Expose
    public List<rgbPalletteEntry> plte;

    @Expose
    public long width;

    public static class rgbPalletteEntry {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Expose
        public short f63120b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Expose
        public short f63121g;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Expose
        public short f63122r;

        public rgbPalletteEntry() {
        }

        public rgbPalletteEntry(short s4, short s7, short s9) {
            this.f63122r = s4;
            this.f63121g = s7;
            this.f63120b = s9;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof rgbPalletteEntry)) {
                return false;
            }
            rgbPalletteEntry rgbpalletteentry = (rgbPalletteEntry) obj;
            return Objects.equals(Short.valueOf(this.f63122r), Short.valueOf(rgbpalletteentry.f63122r)) && Objects.equals(Short.valueOf(this.f63121g), Short.valueOf(rgbpalletteentry.f63121g)) && Objects.equals(Short.valueOf(this.f63120b), Short.valueOf(rgbpalletteentry.f63120b));
        }
    }

    public DisplayPNGCharacteristicsDescriptor() {
    }

    public DisplayPNGCharacteristicsDescriptor(long j10, long j11, byte b10, byte b11, byte b12, byte b13, byte b14) {
        this.width = j10;
        this.height = j11;
        this.bitDepth = b10;
        this.colorType = b11;
        this.compression = b12;
        this.filter = b13;
        this.interlace = b14;
    }

    public static DisplayPNGCharacteristicsDescriptor getDefaultPNGDescriptor() {
        DisplayPNGCharacteristicsDescriptor displayPNGCharacteristicsDescriptor = new DisplayPNGCharacteristicsDescriptor(200L, 400L, (byte) 1, (byte) 3, (byte) 0, (byte) 0, (byte) 0);
        displayPNGCharacteristicsDescriptor.addRGBPalletteEntry(new rgbPalletteEntry((short) 200, (short) 0, (short) 0));
        displayPNGCharacteristicsDescriptor.addRGBPalletteEntry(new rgbPalletteEntry((short) 216, (short) 216, (short) 216));
        return displayPNGCharacteristicsDescriptor;
    }

    public void addRGBPalletteEntry(rgbPalletteEntry rgbpalletteentry) {
        if (this.plte == null) {
            this.plte = new ArrayList();
        }
        this.plte.add(rgbpalletteentry);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DisplayPNGCharacteristicsDescriptor)) {
            return false;
        }
        DisplayPNGCharacteristicsDescriptor displayPNGCharacteristicsDescriptor = (DisplayPNGCharacteristicsDescriptor) obj;
        return Objects.equals(Long.valueOf(this.width), Long.valueOf(displayPNGCharacteristicsDescriptor.width)) && Objects.equals(Long.valueOf(this.height), Long.valueOf(displayPNGCharacteristicsDescriptor.height)) && Objects.equals(Byte.valueOf(this.bitDepth), Byte.valueOf(displayPNGCharacteristicsDescriptor.bitDepth)) && Objects.equals(Byte.valueOf(this.colorType), Byte.valueOf(displayPNGCharacteristicsDescriptor.colorType)) && Objects.equals(Byte.valueOf(this.compression), Byte.valueOf(displayPNGCharacteristicsDescriptor.compression)) && Objects.equals(Byte.valueOf(this.filter), Byte.valueOf(displayPNGCharacteristicsDescriptor.filter)) && Objects.equals(Byte.valueOf(this.interlace), Byte.valueOf(displayPNGCharacteristicsDescriptor.interlace)) && Objects.equals(this.plte, displayPNGCharacteristicsDescriptor.plte);
    }
}
